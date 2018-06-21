/*
               File: SdtContext
        Description: Context
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.65
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

public final  class SdtContext extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtContext( )
   {
      this(  new ModelContext(SdtContext.class));
   }

   public SdtContext( ModelContext context )
   {
      super( context, "SdtContext");
   }

   public SdtContext( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtContext");
   }

   public SdtContext( StructSdtContext struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "User") )
            {
               gxTv_SdtContext_User = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CompanyCode") )
            {
               gxTv_SdtContext_Companycode = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Profile") )
            {
               gxTv_SdtContext_Profile = oReader.getValue() ;
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
         sName = "Context" ;
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
      oWriter.writeElement("User", GXutil.rtrim( gxTv_SdtContext_User));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("CompanyCode", GXutil.trim( GXutil.str( gxTv_SdtContext_Companycode, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Profile", GXutil.rtrim( gxTv_SdtContext_Profile));
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
      AddObjectProperty("User", gxTv_SdtContext_User, false);
      AddObjectProperty("CompanyCode", gxTv_SdtContext_Companycode, false);
      AddObjectProperty("Profile", gxTv_SdtContext_Profile, false);
   }

   public String getgxTv_SdtContext_User( )
   {
      return gxTv_SdtContext_User ;
   }

   public void setgxTv_SdtContext_User( String value )
   {
      gxTv_SdtContext_User = value ;
   }

   public short getgxTv_SdtContext_Companycode( )
   {
      return gxTv_SdtContext_Companycode ;
   }

   public void setgxTv_SdtContext_Companycode( short value )
   {
      gxTv_SdtContext_Companycode = value ;
   }

   public String getgxTv_SdtContext_Profile( )
   {
      return gxTv_SdtContext_Profile ;
   }

   public void setgxTv_SdtContext_Profile( String value )
   {
      gxTv_SdtContext_Profile = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtContext_User = "" ;
      gxTv_SdtContext_Profile = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtContext Clone( )
   {
      return (com.orions2.SdtContext)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtContext struct )
   {
      setgxTv_SdtContext_User(struct.getUser());
      setgxTv_SdtContext_Companycode(struct.getCompanycode());
      setgxTv_SdtContext_Profile(struct.getProfile());
   }

   public com.orions2.StructSdtContext getStruct( )
   {
      com.orions2.StructSdtContext struct = new com.orions2.StructSdtContext ();
      struct.setUser(getgxTv_SdtContext_User());
      struct.setCompanycode(getgxTv_SdtContext_Companycode());
      struct.setProfile(getgxTv_SdtContext_Profile());
      return struct ;
   }

   protected short gxTv_SdtContext_Companycode ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtContext_User ;
   protected String gxTv_SdtContext_Profile ;
   protected String sTagName ;
}

