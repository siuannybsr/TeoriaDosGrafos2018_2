import org.jgrapht.Graph;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.io.GmlImporter;
import org.jgrapht.io.EdgeProvider;
import org.jgrapht.io.ImportException;
import org.jgrapht.io.VertexProvider;

public class ImportSimpleGraphGML {
	// Importa Grafo Simples no formato GML com r�tulo nos v�rtices e nas arestas

	public static void main(String[] args) {
		// Gml
		VertexProvider<Object> vp1 = (label, attributes) -> new DefaultVertex(label, attributes);
		EdgeProvider<Object, RelationshipEdge> ep1 = (from, to, label, attributes) -> new RelationshipEdge(from, to,
				attributes);
		GmlImporter<Object, RelationshipEdge> gmlImporter = new GmlImporter<>(vp1, ep1);
		Graph<Object, RelationshipEdge> graphgml = new SimpleGraph<>(RelationshipEdge.class);
		try {
			gmlImporter.importGraph(graphgml, ImportGraph.readFile("./files/bp1.gml"));
		} catch (ImportException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Grafo importado do arquivo GML: ");
		System.out.println("Arestas: " + graphgml.edgeSet());
		System.out.println("Vertices: " + graphgml.vertexSet());
	}

}
