import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.lang.Comparable;

public class DefaultVertexSet<V> extends HashSet<V> implements Comparable<V> {
	// Para um conjunto de Vertices retorna o objeto vertice identificado pelo label

	static final long serialVersionUID = 1;

	static public DefaultVertex getVertexfromLabel(Set<DefaultVertex> V, String label) {
		Iterator<DefaultVertex> it = V.iterator();
		while (it.hasNext()) {
			DefaultVertex v = it.next();
			String l = v.getLabel();
			if (l.equals(label)) {
				return v;
			}
		}
		return null;
	}

	public int compareTo(DefaultVertexSet<V> s) {
		if ((this.size()) < s.size()) {
			return -1;
		} else if ((this.size()) < s.size()) {
			return 0;
		} else
			return 1;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
