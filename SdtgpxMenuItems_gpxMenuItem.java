/*
               File: SdtgpxMenuItems_gpxMenuItem
        Description: gpxMenuItems
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:15.72
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

public final  class SdtgpxMenuItems_gpxMenuItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtgpxMenuItems_gpxMenuItem( )
   {
      this(  new ModelContext(SdtgpxMenuItems_gpxMenuItem.class));
   }

   public SdtgpxMenuItems_gpxMenuItem( ModelContext context )
   {
      super( context, "SdtgpxMenuItems_gpxMenuItem");
   }

   public SdtgpxMenuItems_gpxMenuItem( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtgpxMenuItems_gpxMenuItem");
   }

   public SdtgpxMenuItems_gpxMenuItem( StructSdtgpxMenuItems_gpxMenuItem struct )
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
               gxTv_SdtgpxMenuItems_gpxMenuItem_Code = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Title") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Title = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URL") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Url = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinkTarget") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Image") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Image = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Description") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Description = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Index") )
            {
               gxTv_SdtgpxMenuItems_gpxMenuItem_Index = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SubItems") )
            {
               if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
               {
                  gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.readxml(oReader, "SubItems") ;
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
         sName = "gpxMenuItems.gpxMenuItem" ;
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
      oWriter.writeElement("Code", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Code));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Title", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Title));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("URL", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Url));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("LinkTarget", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Image", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Image));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Description", GXutil.rtrim( gxTv_SdtgpxMenuItems_gpxMenuItem_Description));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      oWriter.writeElement("Index", GXutil.trim( GXutil.str( gxTv_SdtgpxMenuItems_gpxMenuItem_Index, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "ACBSENA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "ACBSENA");
      }
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems != null )
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
         gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.writexml(oWriter, "SubItems", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Code", gxTv_SdtgpxMenuItems_gpxMenuItem_Code, false);
      AddObjectProperty("Title", gxTv_SdtgpxMenuItems_gpxMenuItem_Title, false);
      AddObjectProperty("URL", gxTv_SdtgpxMenuItems_gpxMenuItem_Url, false);
      AddObjectProperty("LinkTarget", gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget, false);
      AddObjectProperty("Image", gxTv_SdtgpxMenuItems_gpxMenuItem_Image, false);
      AddObjectProperty("Description", gxTv_SdtgpxMenuItems_gpxMenuItem_Description, false);
      AddObjectProperty("Index", gxTv_SdtgpxMenuItems_gpxMenuItem_Index, false);
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems != null )
      {
         AddObjectProperty("SubItems", gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems, false);
      }
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Code( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Code( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Title( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Title( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Url( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Url( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Image( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Image( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = value ;
   }

   public String getgxTv_SdtgpxMenuItems_gpxMenuItem_Description( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Description( String value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = value ;
   }

   public short getgxTv_SdtgpxMenuItems_gpxMenuItem_Index( )
   {
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Index( short value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Index = value ;
   }

   public GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems( )
   {
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
      {
         gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle);
      }
      return gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems( GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> value )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = value ;
   }

   public void setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_SetNull( )
   {
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = null ;
   }

   public boolean getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_IsNull( )
   {
      if ( gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems == null )
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
      gxTv_SdtgpxMenuItems_gpxMenuItem_Code = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Title = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Url = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Image = "" ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Description = "" ;
      sTagName = "" ;
   }

   public com.orions2.SdtgpxMenuItems_gpxMenuItem Clone( )
   {
      return (com.orions2.SdtgpxMenuItems_gpxMenuItem)(clone()) ;
   }

   public void setStruct( com.orions2.StructSdtgpxMenuItems_gpxMenuItem struct )
   {
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Code(struct.getCode());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Title(struct.getTitle());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Url(struct.getUrl());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget(struct.getLinktarget());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Image(struct.getImage());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Description(struct.getDescription());
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Index(struct.getIndex());
      GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle) ;
      GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1 = new GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem>(com.orions2.SdtgpxMenuItems_gpxMenuItem.class, "gpxMenuItems.gpxMenuItem", "ACBSENA", remoteHandle) ;
      gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1.setStruct(struct.getSubitems());
      for (int i = 0; i < gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1.size(); i++)
      {
         gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux.add(new com.orions2.SdtgpxMenuItems_gpxMenuItem(gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1.elementAt(i).getStruct()));
      }
      setgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems(gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux);
   }

   public com.orions2.StructSdtgpxMenuItems_gpxMenuItem getStruct( )
   {
      com.orions2.StructSdtgpxMenuItems_gpxMenuItem struct = new com.orions2.StructSdtgpxMenuItems_gpxMenuItem ();
      struct.setCode(getgxTv_SdtgpxMenuItems_gpxMenuItem_Code());
      struct.setTitle(getgxTv_SdtgpxMenuItems_gpxMenuItem_Title());
      struct.setUrl(getgxTv_SdtgpxMenuItems_gpxMenuItem_Url());
      struct.setLinktarget(getgxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget());
      struct.setImage(getgxTv_SdtgpxMenuItems_gpxMenuItem_Image());
      struct.setDescription(getgxTv_SdtgpxMenuItems_gpxMenuItem_Description());
      struct.setIndex(getgxTv_SdtgpxMenuItems_gpxMenuItem_Index());
      Vector aux_vectorgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = getgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems().getStruct();
      Vector aux_vector1gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.size(); i++)
      {
         aux_vector1gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.addElement(((com.orions2.SdtgpxMenuItems_gpxMenuItem)aux_vectorgxTv_SdtgpxMenuItems_gpxMenuItem_Subitems.elementAt(i)).getStruct());
      }
      struct.setSubitems(aux_vector1gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems);
      return struct ;
   }

   protected short gxTv_SdtgpxMenuItems_gpxMenuItem_Index ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Code ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Title ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Url ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Linktarget ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Image ;
   protected String gxTv_SdtgpxMenuItems_gpxMenuItem_Description ;
   protected String sTagName ;
   protected GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux ;
   protected GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems_aux1 ;
   protected GXBaseCollection<com.orions2.SdtgpxMenuItems_gpxMenuItem> gxTv_SdtgpxMenuItems_gpxMenuItem_Subitems=null ;
}

