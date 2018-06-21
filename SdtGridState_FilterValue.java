/*
               File: SdtGridState_FilterValue
        Description: GridState
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.79
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

public final  class SdtGridState_FilterValue extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtGridState_FilterValue( )
   {
      this(  new ModelContext(SdtGridState_FilterValue.class));
   }

   public SdtGridState_FilterValue( ModelContext context )
   {
      super( context, "SdtGridState_FilterValue");
   }

   public SdtGridState_FilterValue( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtGridState_FilterValue");
   }

   public SdtGridState_FilterValue( StructSdtGridState_FilterValue struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Value") )
            {
               gxTv_SdtGridState_FilterValue_Value = oReader.getValue() ;
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
         sName = "GridState.FilterValue" ;
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
      oWriter.writeElement("Value", GXutil.rtrim( gxTv_SdtGridState_FilterValue_Value));
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
      AddObjectProperty("Value", gxTv_SdtGridState_FilterValue_Value, false);
   }

   public String getgxTv_SdtGridState_FilterValue_Value( )
   {
      return gxTv_SdtGridState_FilterValue_Value ;
   }

   public void setgxTv_SdtGridState_FilterValue_Value( String value )
   {
      gxTv_SdtGridState_FilterValue_Value = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGridState_FilterValue_Value = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtGridState_FilterValue Clone( )
   {
      return (com.orions2.SdtGridState_FilterValue)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtGridState_FilterValue struct )
   {
      setgxTv_SdtGridState_FilterValue_Value(struct.getValue());
   }

   public com.orions2.StructSdtGridState_FilterValue getStruct( )
   {
      com.orions2.StructSdtGridState_FilterValue struct = new com.orions2.StructSdtGridState_FilterValue ();
      struct.setValue(getgxTv_SdtGridState_FilterValue_Value());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtGridState_FilterValue_Value ;
}

