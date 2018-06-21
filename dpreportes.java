/*
               File: DPReportes
        Description: DPReportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 29, 2018 16:56:41.7
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpreportes extends GXProcedure
{
   public dpreportes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpreportes.class ), "" );
   }

   public dpreportes( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.orions2.SdtreportExecutionRequest executeUdp( )
   {
      dpreportes.this.aP0 = aP0;
      dpreportes.this.aP0 = new com.orions2.SdtreportExecutionRequest[] {new com.orions2.SdtreportExecutionRequest()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( com.orions2.SdtreportExecutionRequest[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( com.orions2.SdtreportExecutionRequest[] aP0 )
   {
      dpreportes.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Reportunituri( "/reports/interactive/TransaccionesNovedades" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Async( "true" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Freshdata( "false" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Savedatasnapshot( "false" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Outputformat( "pdf" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Interactive( "true" );
      Gxm1reportexecutionrequest.setgxTv_SdtreportExecutionRequest_Ignorepagination( "false" );
      Gxm2reportexecutionrequest_parameters = (com.orions2.SdtreportExecutionRequest_reportParameter)new com.orions2.SdtreportExecutionRequest_reportParameter(remoteHandle, context);
      Gxm1reportexecutionrequest.getgxTv_SdtreportExecutionRequest_Parameters().add(Gxm2reportexecutionrequest_parameters, 0);
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Name( "REGIONAL" );
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Value( "20" );
      Gxm2reportexecutionrequest_parameters = (com.orions2.SdtreportExecutionRequest_reportParameter)new com.orions2.SdtreportExecutionRequest_reportParameter(remoteHandle, context);
      Gxm1reportexecutionrequest.getgxTv_SdtreportExecutionRequest_Parameters().add(Gxm2reportexecutionrequest_parameters, 0);
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Name( "CENCOS" );
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Value( "101020" );
      Gxm2reportexecutionrequest_parameters = (com.orions2.SdtreportExecutionRequest_reportParameter)new com.orions2.SdtreportExecutionRequest_reportParameter(remoteHandle, context);
      Gxm1reportexecutionrequest.getgxTv_SdtreportExecutionRequest_Parameters().add(Gxm2reportexecutionrequest_parameters, 0);
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Name( "CONSECUTIVO" );
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Value( "8" );
      Gxm2reportexecutionrequest_parameters = (com.orions2.SdtreportExecutionRequest_reportParameter)new com.orions2.SdtreportExecutionRequest_reportParameter(remoteHandle, context);
      Gxm1reportexecutionrequest.getgxTv_SdtreportExecutionRequest_Parameters().add(Gxm2reportexecutionrequest_parameters, 0);
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Name( "USUARIO" );
      Gxm2reportexecutionrequest_parameters.setgxTv_SdtreportExecutionRequest_reportParameter_Value( "NN" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = dpreportes.this.Gxm1reportexecutionrequest;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1reportexecutionrequest = new com.orions2.SdtreportExecutionRequest(remoteHandle, context);
      Gxm2reportexecutionrequest_parameters = new com.orions2.SdtreportExecutionRequest_reportParameter(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private com.orions2.SdtreportExecutionRequest[] aP0 ;
   private com.orions2.SdtreportExecutionRequest Gxm1reportexecutionrequest ;
   private com.orions2.SdtreportExecutionRequest_reportParameter Gxm2reportexecutionrequest_parameters ;
}

