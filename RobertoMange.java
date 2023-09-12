package EstruturaDeDecisaoLogica;

public class RobertoMange {
	public static void main(String[] args) {
		
		
		String des1 = "Excelente";
		String des2 = "Bom";
		String des3 = "Regular";
		String des4 = "Péssimo";
		
		String p1 = "Excelente";
		String p2 = "Bom";
		String p3 = "Regular";
		String p4 = "Péssimo";
		
		String dis1 = "Excelente";
		String dis2 = "Bom";
		String dis3 = "Regular";
		String dis4 = "Péssimo";
		int falta = 0;
		
		
		
		
		String aluno1 = "Laura Mendes";
		String desempenhoA1 = des2;
		String participacaoA1 = p2;
		String disciplinaA1 = dis2;
		int faltaA1 = 10;
		
		
		
		String aluno2 = "Milene Paiva";
		String desempenhoA2 = des1;
		String participacaoA2 = p1;
		String disciplinaA2 = dis1;
		int faltaA2 = 0;
		
		
		
		String aluno3 = "Barbara Oliveira";
		String desempenhoA3 = des1;
		String participacaoA3 = p1;
		String disciplinaA3 = dis2;
		int faltaA3 = 1;
		
		
		
		String testeNome = aluno1;
		String testeDesempenho = desempenhoA1;
		String testeParticipacao = participacaoA1;
		String testeDisciplina = disciplinaA1;
		int testeFalta = faltaA1;
		
		
		
			System.out.println("                      ROBERTO MANGE");
			System.out.println( " ");
			System.out.println("Candidato ou Candidata: ");
		
		
		if(testeFalta == falta & testeDesempenho == des1 & testeParticipacao == p1 & testeDisciplina == dis1){
			System.out.println("Nome: " + testeNome + "     Faltas: " + testeFalta + "     Desempenho: " + testeDesempenho + "     Participação: " + testeParticipacao + "     Disciplina: " + testeDisciplina);
			System.out.println(testeNome + " Você pode ser um aluno Roberto Mange!");
		
		}else{
			System.out.println("Nome: " + testeNome + "     Faltas: " + testeFalta + "     Desempenho: " + testeDesempenho + "     Participação: " + testeParticipacao + "     Disciplina: " + testeDisciplina);
			System.out.println(testeNome + " Suas informações não caracterizam um aluno Roberto Mange.");
		}
				
		
		
		
		
	}
}
