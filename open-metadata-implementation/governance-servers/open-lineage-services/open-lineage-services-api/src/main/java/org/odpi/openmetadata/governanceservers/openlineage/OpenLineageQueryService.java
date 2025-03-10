/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.governanceservers.openlineage;

import org.odpi.openmetadata.governanceservers.openlineage.ffdc.OpenLineageException;
import org.odpi.openmetadata.governanceservers.openlineage.model.Scope;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageResponse;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageVertexResponse;

public interface OpenLineageQueryService {


    /**
     * Retrieve lineage starting from the entity identified by the guid
     *
     * @param scope            the type of lineage to retrieve
     * @param guid             the guid of the entity from which to start
     * @param includeProcesses
     * @return the lineage vertices and edges that compose the graph
     * @throws OpenLineageException
     */
    LineageResponse lineage(Scope scope, String guid, boolean includeProcesses) throws OpenLineageException;

    /**
     * Gets entity details.
     *
     * @param guid the guid
     * @return the entity details
     */
    LineageVertexResponse getEntityDetails(String guid);
}
