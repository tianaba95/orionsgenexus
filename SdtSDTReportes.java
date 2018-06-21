/*
               File: SdtSDTReportes
        Description: SDTReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 15:35:8.95
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

public final  class SdtSDTReportes extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTReportes( )
   {
      this(  new ModelContext(SdtSDTReportes.class));
   }

   public SdtSDTReportes( ModelContext context )
   {
      super( context, "SdtSDTReportes");
   }

   public SdtSDTReportes( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTReportes");
   }

   public SdtSDTReportes( StructSdtSDTReportes struct )
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
               gxTv_SdtSDTReportes_Reportunituri = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "async") )
            {
               gxTv_SdtSDTReportes_Async = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "freshData") )
            {
               gxTv_SdtSDTReportes_Freshdata = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saveDataSnapshot") )
            {
               gxTv_SdtSDTReportes_Savedatasnapshot = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "outputFormat") )
            {
               gxTv_SdtSDTReportes_Outputformat = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "interactive") )
            {
               gxTv_SdtSDTReportes_Interactive = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ignorePagination") )
            {
               gxTv_SdtSDTReportes_Ignorepagination = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "parameters") )
            {
               if ( gxTv_SdtSDTReportes_Parameters == null )
               {
                  gxTv_SdtSDTReportes_Parameters = new GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem>(com.orions2.SdtSDTReportes_parametersItem.class, "SDTReportes.parametersItem", "ACBSENA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTReportes_Parameters.readxmlcollection(oReader, "parameters", "parametersItem") ;
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
         sName = "SDTReportes" ;
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
      oWriter.writeElement("reportUnitUri", GXutil.rtrim( gxTv_SdtSDTReportes_Reportunituri));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("async", GXutil.rtrim( gxTv_SdtSDTReportes_Async));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("freshData", GXutil.rtrim( gxTv_SdtSDTReportes_Freshdata));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("saveDataSnapshot", GXutil.rtrim( gxTv_SdtSDTReportes_Savedatasnapshot));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("outputFormat", GXutil.rtrim( gxTv_SdtSDTReportes_Outputformat));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("interactive", GXutil.rtrim( gxTv_SdtSDTReportes_Interactive));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("ignorePagination", GXutil.rtrim( gxTv_SdtSDTReportes_Ignorepagination));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtSDTReportes_Parameters != null )
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
         gxTv_SdtSDTReportes_Parameters.writexmlcollection(oWriter, "parameters", sNameSpace1, "parametersItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("reportUnitUri", gxTv_SdtSDTReportes_Reportunituri, false);
      AddObjectProperty("async", gxTv_SdtSDTReportes_Async, false);
      AddObjectProperty("freshData", gxTv_SdtSDTReportes_Freshdata, false);
      AddObjectProperty("saveDataSnapshot", gxTv_SdtSDTReportes_Savedatasnapshot, false);
      AddObjectProperty("outputFormat", gxTv_SdtSDTReportes_Outputformat, false);
      AddObjectProperty("interactive", gxTv_SdtSDTReportes_Interactive, false);
      AddObjectProperty("ignorePagination", gxTv_SdtSDTReportes_Ignorepagination, false);
      if ( gxTv_SdtSDTReportes_Parameters != null )
      {
         AddObjectProperty("parameters", gxTv_SdtSDTReportes_Parameters, false);
      }
   }

   public String getgxTv_SdtSDTReportes_Reportunituri( )
   {
      return gxTv_SdtSDTReportes_Reportunituri ;
   }

   public void setgxTv_SdtSDTReportes_Reportunituri( String value )
   {
      gxTv_SdtSDTReportes_Reportunituri = value ;
   }

   public String getgxTv_SdtSDTReportes_Async( )
   {
      return gxTv_SdtSDTReportes_Async ;
   }

   public void setgxTv_SdtSDTReportes_Async( String value )
   {
      gxTv_SdtSDTReportes_Async = value ;
   }

   public String getgxTv_SdtSDTReportes_Freshdata( )
   {
      return gxTv_SdtSDTReportes_Freshdata ;
   }

   public void setgxTv_SdtSDTReportes_Freshdata( String value )
   {
      gxTv_SdtSDTReportes_Freshdata = value ;
   }

   public String getgxTv_SdtSDTReportes_Savedatasnapshot( )
   {
      return gxTv_SdtSDTReportes_Savedatasnapshot ;
   }

   public void setgxTv_SdtSDTReportes_Savedatasnapshot( String value )
   {
      gxTv_SdtSDTReportes_Savedatasnapshot = value ;
   }

   public String getgxTv_SdtSDTReportes_Outputformat( )
   {
      return gxTv_SdtSDTReportes_Outputformat ;
   }

   public void setgxTv_SdtSDTReportes_Outputformat( String value )
   {
      gxTv_SdtSDTReportes_Outputformat = value ;
   }

   public String getgxTv_SdtSDTReportes_Interactive( )
   {
      return gxTv_SdtSDTReportes_Interactive ;
   }

   public void setgxTv_SdtSDTReportes_Interactive( String value )
   {
      gxTv_SdtSDTReportes_Interactive = value ;
   }

   public String getgxTv_SdtSDTReportes_Ignorepagination( )
   {
      return gxTv_SdtSDTReportes_Ignorepagination ;
   }

   public void setgxTv_SdtSDTReportes_Ignorepagination( String value )
   {
      gxTv_SdtSDTReportes_Ignorepagination = value ;
   }

   public GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> getgxTv_SdtSDTReportes_Parameters( )
   {
      if ( gxTv_SdtSDTReportes_Parameters == null )
      {
         gxTv_SdtSDTReportes_Parameters = new GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem>(com.orions2.SdtSDTReportes_parametersItem.class, "SDTReportes.parametersItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtSDTReportes_Parameters ;
   }

   public void setgxTv_SdtSDTReportes_Parameters( GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> value )
   {
      gxTv_SdtSDTReportes_Parameters = value ;
   }

   public void setgxTv_SdtSDTReportes_Parameters_SetNull( )
   {
      gxTv_SdtSDTReportes_Parameters = null ;
   }

   public boolean getgxTv_SdtSDTReportes_Parameters_IsNull( )
   {
      if ( gxTv_SdtSDTReportes_Parameters == null )
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
      gxTv_SdtSDTReportes_Reportunituri = "" ;
      gxTv_SdtSDTReportes_Async = "" ;
      gxTv_SdtSDTReportes_Freshdata = "" ;
      gxTv_SdtSDTReportes_Savedatasnapshot = "" ;
      gxTv_SdtSDTReportes_Outputformat = "" ;
      gxTv_SdtSDTReportes_Interactive = "" ;
      gxTv_SdtSDTReportes_Ignorepagination = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtSDTReportes Clone( )
   {
      return (com.orions2.SdtSDTReportes)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtSDTReportes struct )
   {
      setgxTv_SdtSDTReportes_Reportunituri(struct.getReportunituri());
      setgxTv_SdtSDTReportes_Async(struct.getAsync());
      setgxTv_SdtSDTReportes_Freshdata(struct.getFreshdata());
      setgxTv_SdtSDTReportes_Savedatasnapshot(struct.getSavedatasnapshot());
      setgxTv_SdtSDTReportes_Outputformat(struct.getOutputformat());
      setgxTv_SdtSDTReportes_Interactive(struct.getInteractive());
      setgxTv_SdtSDTReportes_Ignorepagination(struct.getIgnorepagination());
      GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> gxTv_SdtSDTReportes_Parameters_aux = new GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem>(com.orions2.SdtSDTReportes_parametersItem.class, "SDTReportes.parametersItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> gxTv_SdtSDTReportes_Parameters_aux1 = new GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem>(com.orions2.SdtSDTReportes_parametersItem.class, "SDTReportes.parametersItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtSDTReportes_Parameters_aux1.setStruct(struct.getParameters());
      for (int i = 0; i < gxTv_SdtSDTReportes_Parameters_aux1.size(); i++)
      {
         gxTv_SdtSDTReportes_Parameters_aux.add(new com.orions2.SdtSDTReportes_parametersItem(gxTv_SdtSDTReportes_Parameters_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtSDTReportes_Parameters(gxTv_SdtSDTReportes_Parameters_aux);
   }

   public com.orions2.StructSdtSDTReportes getStruct( )
   {
      com.orions2.StructSdtSDTReportes struct = new com.orions2.StructSdtSDTReportes ();
      struct.setReportunituri(getgxTv_SdtSDTReportes_Reportunituri());
      struct.setAsync(getgxTv_SdtSDTReportes_Async());
      struct.setFreshdata(getgxTv_SdtSDTReportes_Freshdata());
      struct.setSavedatasnapshot(getgxTv_SdtSDTReportes_Savedatasnapshot());
      struct.setOutputformat(getgxTv_SdtSDTReportes_Outputformat());
      struct.setInteractive(getgxTv_SdtSDTReportes_Interactive());
      struct.setIgnorepagination(getgxTv_SdtSDTReportes_Ignorepagination());
      Vector aux_vectorgxTv_SdtSDTReportes_Parameters = getgxTv_SdtSDTReportes_Parameters().getStruct();
      Vector aux_vector1gxTv_SdtSDTReportes_Parameters = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDTReportes_Parameters.size(); i++)
      {
         aux_vector1gxTv_SdtSDTReportes_Parameters.addElement(((com.orions2.SdtSDTReportes_parametersItem)aux_vectorgxTv_SdtSDTReportes_Parameters.elementAt(i)).getStruct());
      }
      struct.setParameters(aux_vector1gxTv_SdtSDTReportes_Parameters);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTReportes_Reportunituri ;
   protected String gxTv_SdtSDTReportes_Async ;
   protected String gxTv_SdtSDTReportes_Freshdata ;
   protected String gxTv_SdtSDTReportes_Savedatasnapshot ;
   protected String gxTv_SdtSDTReportes_Outputformat ;
   protected String gxTv_SdtSDTReportes_Interactive ;
   protected String gxTv_SdtSDTReportes_Ignorepagination ;
   protected GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> gxTv_SdtSDTReportes_Parameters_aux ;
   protected GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> gxTv_SdtSDTReportes_Parameters_aux1 ;
   protected GXBaseCollection<com.orions2.SdtSDTReportes_parametersItem> gxTv_SdtSDTReportes_Parameters=null ;
}

