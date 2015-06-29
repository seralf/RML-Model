/***************************************************************************
 *
 * RML Model : SubjectMap Interface
 *
 * A Subject Map is a Term Map which generates the subject
 * of the RDF triples generated by a particular Triples Map.
 * 
 * @author andimou
 *
 ****************************************************************************/
package be.ugent.mmlab.rml.model.RDFTerm;

import java.util.Set;
import org.openrdf.model.URI;

public interface SubjectMap extends TermMap {

    /**
     * A Subject Map may have one or more class IRIs.
     * 
     * @return Set<URI>
     * 
     */
    public Set<URI> getClassIRIs();
    
    /**
     *
     * @param uri
     */
    public void setClassIRIs(Set<URI> uri);

    /**
     * A Subject Map may have one or more associated Graph Maps.
     * 
     * @return Set<GraphMap>
     * 
     */
    public Set<GraphMap> getGraphMaps();
    
    /**
     *
     * @param graphMap
     * 
     */
    public void setGraphMaps(Set<GraphMap> graphMap);

}
