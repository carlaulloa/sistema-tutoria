package pe.edu.sistemas.unayoe.services;

import java.util.List;

import pe.edu.sistemas.unayoe.unayoe.bo.CursoBO;
import pe.edu.sistemas.unayoe.unayoe.bo.SesionBO;
import pe.edu.sistemas.unayoe.unayoe.bo.AlumnoBO;
import pe.edu.sistemas.unayoe.unayoe.bo.TutoriaBO;
import pe.edu.sistemas.unayoe.unayoe.bo.EncuestaBO;
import pe.edu.sistemas.unayoe.unayoe.bo.ProfesorBO;
import pe.edu.sistemas.unayoe.unayoe.bo.ClaseMaestra;
import pe.edu.sistemas.unayoe.unayoe.bo.ObservacionBO;
import pe.edu.sistemas.unayoe.unayoe.bo.DisponibilidadBO;
import pe.edu.sistemas.unayoe.unayoe.bo.AsistenciaTAlumBO;
import pe.edu.sistemas.unayoe.unayoe.bo.AsistenciaTProfBO;
import pe.edu.sistemas.unayoe.unayoe.bo.AreaConocimientoBO;

/**
 * Interfaz Services de Tutoría
 * @author Bruno Palacios
 *
 */

public interface TutoriaServices {
	public List<ProfesorBO>   		listarProfesores() throws Exception;
	public List<AlumnoBO>           listarAlumnosRegulares() throws Exception;
	public List<ProfesorBO>         listarTutoresRegulares() throws Exception;
	public List<AreaConocimientoBO> listarAreaConocimiento() throws Exception;
	public AlumnoBO                 buscarDatosAlumno(String codAlumno) throws Exception;
	public List<ClaseMaestra> 		actualizarHoraFin(int idHoraInicio) throws Exception;
	public List<EncuestaBO>         listarPreguntas(String tipoPregunta) throws Exception;
	public List<EncuestaBO>         buscarDatosEncuesta(String codTutoria) throws Exception;
	public List<ProfesorBO>   		listarTutoresRegulares(String codCurso) throws Exception;
	public String                   buscarTutoriaEncuesta(String codTutoria) throws Exception;
	public List<ProfesorBO>         listarTutoresObservados(String codCurso) throws Exception;
	public void  					guardarDatosTutoria(TutoriaBO tutoriabo) throws Exception;	
	public List<ClaseMaestra> 		listarHoraFin(String tabla, String campo) throws Exception;
	public List<CursoBO>            listarCursosxAlumnoRegular(String codAlumno) throws Exception;
	public List<ClaseMaestra> 		listarHoraInicio(String tabla, String campo) throws Exception;	
	public List<AlumnoBO>           listarAlumnosRegularesxCurso(String codCurso) throws Exception;
	public List<SesionBO>           listarSesionesCierre(String codTutoria, int sesion) throws Exception;
	public List<TutoriaBO>          buscarTutoriaxCodigoAlumnoRegular(String codAlumno) throws Exception;
	public void                     procesarTutoriaRegulares(TutoriaBO tutoriaBO, int modo) throws Exception;				
	public List<CursoBO> 			listarCursosxAreaConocimiento(String codAreaConocimiento) throws Exception;	
	public List<TutoriaBO>          buscarTutoriaxCodigoAlumno(String codAlumno, int tipoAlumno) throws Exception;	
	public int                      verificarExistenciaObservacion(String codTutoria, int sesion) throws Exception;
	public List<AsistenciaTProfBO>  buscarAsistenciaDeProfesorTutoria(String fecha, String codigoCurso) throws Exception;			
	public void                     guardarEncuestaInicial(EncuestaBO encuesta, String codTutoria, int modo) throws Exception;
	public List<DisponibilidadBO>   listarDisponibilidades(String codCurso, String codUsuario, int tipoUsuario) throws Exception;
	public void 					procesarTutoriaObservados(TutoriaBO tutoria, String codUsuario, int tipoAlumno) throws Exception;	
	public List<TutoriaBO> 			listarHorariosDeTutoriaProfesor(Integer anio , Integer periodo ,String p_codigo) throws Exception;
	public void                     actualizarEstadoObservacion(ObservacionBO observacion, int indicadorObservacion) throws Exception;
	public String 					buscarTutoria(int anio, int periodo, String codCurso, String codAlumno, String codDocente) throws Exception;
	public List<TutoriaBO> 			listarHorariosDeTutoriaxSemana(Integer anio , Integer periodo ,String c_codigo , String dia)throws Exception;
	public List<ObservacionBO>      listarObservaciones(String codCurso, String codDocente, String codAlumno, int procesoTutoria) throws Exception;
	public void                     guardarRegistroAsistencia(TutoriaBO asistenciaTutorias, String fecha, int tipoAlumno, int modo) throws Exception;	
	public void                     guardarObservacionesAsistencia(String codTutoria, String observacion, String criticidad, int sesion,String razon,String fechaCumplimiento) throws Exception;
	public List<AsistenciaTAlumBO>  buscarAsistenciaDeAlumnosTutoria(String periodo, String anio, String dia, String curso, String fecha) throws Exception;
	public List<TutoriaBO>          listarDatosTutoria(String codCurso, String codDocente, String codAlumno, int procesoTutoria, int modoUsuario) throws Exception;
	public List<TutoriaBO> 			listarHorariosDeTutoria(Integer anio, Integer periodo, String a_codigo, String codUsuario, int procesoTutoria)throws Exception;
	public void                     guardarRegistroDisponibilidad (DisponibilidadBO disponibilidad, String usuario, int modo, int procesoRegistro) throws Exception;	
	public void                     guardarActaTutoria(int anio, int periodo, String codTutoria, int sesion, byte[] actaTutoria, String nombre, int estadoActa) throws Exception;
	public List<SesionBO>     	 	listarSesionTutoria(int anio, int periodo, String codCurso, String codDocente, String codAlumno, int procesoTutoria, int modo) throws Exception;	
	public List<TutoriaBO> 			buscarAsistenciaAlumnosTutoria(String codDocente, String codCurso, String codAlumno, String fechaTutoria, int tipoAlumno, int modo) throws Exception;
	public SesionBO                 obtenerActaTutoria(int anio, int periodo, String codCurso, String codDocente, String codAlumno, int sesion, int procesoTutoria, int modo) throws Exception;
	public SesionBO                 buscarSesionTutoria(int anio, int periodo, String codCurso, String codDocente, String codAlumno, int sesion, int procesoTutoria, int modo) throws Exception;
	public List<AsistenciaTAlumBO>  buscarAsistenciaDeAlumnosTutoriaUser(String periodo, String anio, String dia, String curso, String codUser, String horaIni, String horaFin) throws Exception;	
}
