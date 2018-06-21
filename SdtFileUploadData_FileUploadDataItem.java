/*
               File: SdtFileUploadData_FileUploadDataItem
        Description: FileUploadData
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 14:13:18.72
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

public final  class SdtFileUploadData_FileUploadDataItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtFileUploadData_FileUploadDataItem( )
   {
      this(  new ModelContext(SdtFileUploadData_FileUploadDataItem.class));
   }

   public SdtFileUploadData_FileUploadDataItem( ModelContext context )
   {
      super( context, "SdtFileUploadData_FileUploadDataItem");
   }

   public SdtFileUploadData_FileUploadDataItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtFileUploadData_FileUploadDataItem");
   }

   public SdtFileUploadData_FileUploadDataItem( StructSdtFileUploadData_FileUploadDataItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FullName") )
            {
               gxTv_SdtFileUploadData_FileUploadDataItem_Fullname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtFileUploadData_FileUploadDataItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Extension") )
            {
               gxTv_SdtFileUploadData_FileUploadDataItem_Extension = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Size") )
            {
               gxTv_SdtFileUploadData_FileUploadDataItem_Size = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "File") )
            {
               gxTv_SdtFileUploadData_FileUploadDataItem_File=GXutil.blobFromBase64( oReader.getValue()) ;
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
         sName = "FileUploadData.FileUploadDataItem" ;
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
      oWriter.writeElement("FullName", GXutil.rtrim( gxTv_SdtFileUploadData_FileUploadDataItem_Fullname));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Name", GXutil.rtrim( gxTv_SdtFileUploadData_FileUploadDataItem_Name));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Extension", GXutil.rtrim( gxTv_SdtFileUploadData_FileUploadDataItem_Extension));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Size", GXutil.trim( GXutil.str( gxTv_SdtFileUploadData_FileUploadDataItem_Size, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("File", GXutil.blobToBase64( gxTv_SdtFileUploadData_FileUploadDataItem_File));
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
      AddObjectProperty("FullName", gxTv_SdtFileUploadData_FileUploadDataItem_Fullname, false);
      AddObjectProperty("Name", gxTv_SdtFileUploadData_FileUploadDataItem_Name, false);
      AddObjectProperty("Extension", gxTv_SdtFileUploadData_FileUploadDataItem_Extension, false);
      AddObjectProperty("Size", gxTv_SdtFileUploadData_FileUploadDataItem_Size, false);
      AddObjectProperty("File", gxTv_SdtFileUploadData_FileUploadDataItem_File, false);
   }

   public String getgxTv_SdtFileUploadData_FileUploadDataItem_Fullname( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Fullname ;
   }

   public void setgxTv_SdtFileUploadData_FileUploadDataItem_Fullname( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Fullname = value ;
   }

   public String getgxTv_SdtFileUploadData_FileUploadDataItem_Name( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Name ;
   }

   public void setgxTv_SdtFileUploadData_FileUploadDataItem_Name( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Name = value ;
   }

   public String getgxTv_SdtFileUploadData_FileUploadDataItem_Extension( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Extension ;
   }

   public void setgxTv_SdtFileUploadData_FileUploadDataItem_Extension( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Extension = value ;
   }

   public long getgxTv_SdtFileUploadData_FileUploadDataItem_Size( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_Size ;
   }

   public void setgxTv_SdtFileUploadData_FileUploadDataItem_Size( long value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Size = value ;
   }

   @GxUpload
   public String getgxTv_SdtFileUploadData_FileUploadDataItem_File( )
   {
      return gxTv_SdtFileUploadData_FileUploadDataItem_File ;
   }

   public void setgxTv_SdtFileUploadData_FileUploadDataItem_File( String value )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_File = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFileUploadData_FileUploadDataItem_Fullname = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_Name = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_Extension = "" ;
      gxTv_SdtFileUploadData_FileUploadDataItem_File = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtFileUploadData_FileUploadDataItem Clone( )
   {
      return (com.orions2.SdtFileUploadData_FileUploadDataItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtFileUploadData_FileUploadDataItem struct )
   {
      setgxTv_SdtFileUploadData_FileUploadDataItem_Fullname(struct.getFullname());
      setgxTv_SdtFileUploadData_FileUploadDataItem_Name(struct.getName());
      setgxTv_SdtFileUploadData_FileUploadDataItem_Extension(struct.getExtension());
      setgxTv_SdtFileUploadData_FileUploadDataItem_Size(struct.getSize());
      setgxTv_SdtFileUploadData_FileUploadDataItem_File(struct.getFile());
   }

   public com.orions2.StructSdtFileUploadData_FileUploadDataItem getStruct( )
   {
      com.orions2.StructSdtFileUploadData_FileUploadDataItem struct = new com.orions2.StructSdtFileUploadData_FileUploadDataItem ();
      struct.setFullname(getgxTv_SdtFileUploadData_FileUploadDataItem_Fullname());
      struct.setName(getgxTv_SdtFileUploadData_FileUploadDataItem_Name());
      struct.setExtension(getgxTv_SdtFileUploadData_FileUploadDataItem_Extension());
      struct.setSize(getgxTv_SdtFileUploadData_FileUploadDataItem_Size());
      struct.setFile(getgxTv_SdtFileUploadData_FileUploadDataItem_File());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtFileUploadData_FileUploadDataItem_Size ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Fullname ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Name ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_Extension ;
   protected String sTagName ;
   protected String gxTv_SdtFileUploadData_FileUploadDataItem_File ;
}

