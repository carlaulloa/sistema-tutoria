package pe.edu.sistemas.unayoe.services.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.sistemas.unayoe.core.transformer.Transformer;
import pe.edu.sistemas.unayoe.dao.dominio.Tutoria;
import pe.edu.sistemas.unayoe.dao.dominio.TutoriaPK;
import pe.edu.sistemas.unayoe.unayoe.bo.TutoriaBO;

// TODO: Auto-generated Javadoc
/**
 * The Class TutoriaTransformerToENTIDAD.
 */
@Component("tutoriaTransformerToENTIDAD")
@Scope("singleton")
public class TutoriaTransformerToENTIDAD implements Transformer<TutoriaBO,Tutoria> {

	/* (non-Javadoc)
	 * @see pe.edu.sistemas.unayoe.core.transformer.Transformer#transformer(java.lang.Object)
	 */
	public Tutoria transformer(final TutoriaBO tutoriaBO) {
		Tutoria tutoria = new Tutoria();
		TutoriaPK tutoriaok= new TutoriaPK(     );
		if(tutoriaBO!=null){
		// falta
			 
		}
		return tutoria;
	}
	 
	

	/* (non-Javadoc)
	 * @see pe.edu.sistemas.unayoe.core.transformer.Transformer#transformer(java.util.List)
	 */
	public List<Tutoria> transformer(final List<TutoriaBO> lista) {
		List<Tutoria> listaAlumno = new ArrayList<Tutoria>();
		for (TutoriaBO alumnoBO : lista) {
			listaAlumno.add(transformer(alumnoBO));
		}
		return listaAlumno;
	}

}
