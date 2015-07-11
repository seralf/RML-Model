package be.ugent.mmlab.rml.model;

import be.ugent.mmlab.rml.model.RDFTerm.SubjectMap;
import java.util.Set;

/**
 *************************************************************************
 *
 * RML - Model : TriplesMap Interface
 *
 * A Triples Map summarizes the Mapping Definitions for translating each
 * iteration of a Logical Source to zero or more RDF triples.
 * 
 * @author mielvandersande, andimou
 *
 **************************************************************************
 */
public interface TriplesMap {

    /**
     * 
     * A Triples Map must have exactly one Logical Source.
     * 
     * @return LogicalSource
     * 
     */
    public LogicalSource getLogicalSource();

    /**
     *
     * @param logicalSource
     * 
     */
    public void setLogicalSource(LogicalSource logicalSource);

    /**
     * A Triples Map must have exactly one Subject Map.
     * 
     * @return SubjectMap
     * 
     */
    public SubjectMap getSubjectMap();

    /**
     *
     * @param SubjectMap
     * 
     */
    public void setSubjectMap(SubjectMap subjectMap);

    /**
     * 
     * A Triples Map may have zero or more Predicate Object Maps 
     * Each specifies a predicate-object pair that,
     * together with the subject generated by the Subject Map, 
     * form the RDF triples for each Iteration.
     *
     * @return Set <PredicateObjectMap>
     * 
     */
    public Set<PredicateObjectMap> getPredicateObjectMaps();

    /**
     *
     * @param predicateObjectMap
     *
     */
    public void setPredicateObjectMap(PredicateObjectMap predicateObjectMap);

    /**
     * The Triples Map name.
     */
    public String getName();

    /**
     *
     * @param name
     */
    public void setName(String name);
}
