/*
               File: SdtTabOptions_TabOptionsItem
        Description: TabOptions
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:20.75
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

public final  class SdtTabOptions_TabOptionsItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtTabOptions_TabOptionsItem( )
   {
      this(  new ModelContext(SdtTabOptions_TabOptionsItem.class));
   }

   public SdtTabOptions_TabOptionsItem( ModelContext context )
   {
      super( context, "SdtTabOptions_TabOptionsItem");
   }

   public SdtTabOptions_TabOptionsItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtTabOptions_TabOptionsItem");
   }

   public SdtTabOptions_TabOptionsItem( StructSdtTabOptions_TabOptionsItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Code") )
            {
               gxTv_SdtTabOptions_TabOptionsItem_Code = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Description") )
            {
               gxTv_SdtTabOptions_TabOptionsItem_Description = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Link") )
            {
               gxTv_SdtTabOptions_TabOptionsItem_Link = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "WebComponent") )
            {
               gxTv_SdtTabOptions_TabOptionsItem_Webcomponent = oReader.getValue() ;
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
         sName = "TabOptions.TabOptionsItem" ;
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
      oWriter.writeElement("Code", GXutil.rtrim( gxTv_SdtTabOptions_TabOptionsItem_Code));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Description", GXutil.rtrim( gxTv_SdtTabOptions_TabOptionsItem_Description));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Link", GXutil.rtrim( gxTv_SdtTabOptions_TabOptionsItem_Link));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("WebComponent", GXutil.rtrim( gxTv_SdtTabOptions_TabOptionsItem_Webcomponent));
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
      AddObjectProperty("Code", gxTv_SdtTabOptions_TabOptionsItem_Code, false);
      AddObjectProperty("Description", gxTv_SdtTabOptions_TabOptionsItem_Description, false);
      AddObjectProperty("Link", gxTv_SdtTabOptions_TabOptionsItem_Link, false);
      AddObjectProperty("WebComponent", gxTv_SdtTabOptions_TabOptionsItem_Webcomponent, false);
   }

   public String getgxTv_SdtTabOptions_TabOptionsItem_Code( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Code ;
   }

   public void setgxTv_SdtTabOptions_TabOptionsItem_Code( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Code = value ;
   }

   public String getgxTv_SdtTabOptions_TabOptionsItem_Description( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Description ;
   }

   public void setgxTv_SdtTabOptions_TabOptionsItem_Description( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Description = value ;
   }

   public String getgxTv_SdtTabOptions_TabOptionsItem_Link( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Link ;
   }

   public void setgxTv_SdtTabOptions_TabOptionsItem_Link( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Link = value ;
   }

   public String getgxTv_SdtTabOptions_TabOptionsItem_Webcomponent( )
   {
      return gxTv_SdtTabOptions_TabOptionsItem_Webcomponent ;
   }

   public void setgxTv_SdtTabOptions_TabOptionsItem_Webcomponent( String value )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Webcomponent = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTabOptions_TabOptionsItem_Code = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Description = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Link = "" ;
      gxTv_SdtTabOptions_TabOptionsItem_Webcomponent = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtTabOptions_TabOptionsItem Clone( )
   {
      return (com.orions2.SdtTabOptions_TabOptionsItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtTabOptions_TabOptionsItem struct )
   {
      setgxTv_SdtTabOptions_TabOptionsItem_Code(struct.getCode());
      setgxTv_SdtTabOptions_TabOptionsItem_Description(struct.getDescription());
      setgxTv_SdtTabOptions_TabOptionsItem_Link(struct.getLink());
      setgxTv_SdtTabOptions_TabOptionsItem_Webcomponent(struct.getWebcomponent());
   }

   public com.orions2.StructSdtTabOptions_TabOptionsItem getStruct( )
   {
      com.orions2.StructSdtTabOptions_TabOptionsItem struct = new com.orions2.StructSdtTabOptions_TabOptionsItem ();
      struct.setCode(getgxTv_SdtTabOptions_TabOptionsItem_Code());
      struct.setDescription(getgxTv_SdtTabOptions_TabOptionsItem_Description());
      struct.setLink(getgxTv_SdtTabOptions_TabOptionsItem_Link());
      struct.setWebcomponent(getgxTv_SdtTabOptions_TabOptionsItem_Webcomponent());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Code ;
   protected String sTagName ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Description ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Link ;
   protected String gxTv_SdtTabOptions_TabOptionsItem_Webcomponent ;
}

