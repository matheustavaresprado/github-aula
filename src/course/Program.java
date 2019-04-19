package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

import entidades.Estudante;
import matematica.Triangulo;

public class Program {

	public static void main(String[] args) throws ParseException {
//		wfefewfew
//		String s = "teste";
//		
//		System.out.println(s);
//		
//		s = s + " erro";
//		
//		System.out.println(s);
//		
//		String s1 = "1.10";
//		
//		//System.out.println(Integer.parseInt(s1));
//		System.out.println(Double.parseDouble(s1));
//		//Locale.setDefault(Locale.);
//		
//		double a = 1.0;
//		double b = -3.0;
//		double c = -4.0;
//		
//		double[] resp = Matematica.baskara(a, b, c);
//		
//		System.out.println(resp[0] + " | " + resp[1]);
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		sc.nextLine();
//		String s = sc.nextLine();
//		char gender = sc.next().charAt(1);
//		
//		System.out.println(x);
//		System.out.println(s);
//		System.out.println(gender);
//		sc.close();
		
		
//		boolean v = true;
//		boolean f = false;
//		
//		System.out.println(v && f);
//		System.out.println(v && v);
//		System.out.println(f && v);
//		System.out.println(f && f);
//		
//		System.out.println(v || f);
//		System.out.println(v || v);
//		System.out.println(f || v);
//		System.out.println(f || f);
		
		
		//System.out.println(false || true && true);
		
//		int n1 = 7; //111 101  &101 |111 ^010
//		int n2 = 5;
//		
//		System.out.println(n1 & n2);
//		System.out.println(n1 | n2);
//		System.out.println(n1 ^ n2);
//		
//		String s = "fffffff fffff";
//		
//		s = s.replace('f', 'k');
//		//s.repla
//		System.out.println(s);
		
		//aulaString();
		
//		System.out.println(maior(6,7,11));
//		int x = 10;
//		
//		x++;
//		x--;
		
		//exerc();
		//areaTriangulo();
		//triangulo();
		//AulaArray();
		//aulaMatrizes();
		//datas();
		calendar();
	}
	
	public static void aulaString() {
		
		String s = "MATHEUS TaVaRes prado  ";
		
		//minusculas
		String s1 = s.toLowerCase();
		
		//maiuscula
		String s2 = s.toUpperCase();
		
		//eliminar espaços em branco
		String s3 = s.trim();
		
		//substring
		String s4 = s.substring(2);
		String s5 = s.substring(2, 9);
		
		//replace
		String s6 = s.replace('a', 'k');
		String s7 = s.replace(" ", " kkk ");
		
		//posicao na string
		int i = s.indexOf('T');
		int j = s.indexOf("TH");
		int k = s.lastIndexOf('o');//posicao da ultima ocorrencia
		
		//split
		String sp = "O rato roeu a roupa do rei de roma";
		String[] ps = sp.split(" ");
		
		System.out.println("-" + s + "-");
		System.out.println("-" + s1 + "-");
		System.out.println("-" + s2 + "-");
		System.out.println("-" + s3 + "-");
		System.out.println("-" + s4 + "-");
		System.out.println("-" + s5 + "-");
		System.out.println("-" + s6 + "-");
		System.out.println("-" + s7 + "-");
		System.out.println("- " + i + " - " + j + " - " + k + " - ");
		
		for(int x = 0; x<ps.length; x++) {
			System.out.println(ps[x]);
		}
	}
	
	public static void testeIf() {
		
		int x, y= 10;
		
		if(true) {
			x = 10;
		}
		
		System.out.println(x + y);
	}
	
	public static int maior(int a, int b, int c) {
		int x = a > b ? a : b;
		return x > c ? x : c;
	}
	
	
	public static void exerc() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = s.nextInt();
		
		while (n <=0) {
			System.out.println("Digite um número positivo:");
			n = s.nextInt();
		}
		
		int[] nums = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.println("Digite um número:");
			nums[i] = s.nextInt();
		}
		
		System.out.println("Maior = " + maior(nums));
		s.close();
	}
	
	public static int maior(int[] nums) {
		int maior = Integer.MIN_VALUE;
		for(int i = 0; i<nums.length; i++) {
			maior = maior > nums[i] ? maior : nums[i];
		}
		return maior;
	}
	
	public static double areaTriangulo() {
		Triangulo t1 = new Triangulo(3.0, 4.0, 5.0);
		Triangulo t2 = new Triangulo(7.5, 4.5, 4.02);
		
		double a1 = t1.getArea();
		double a2 = t2.getArea();
		
		System.out.println(a1);
		System.out.println(a2);
		
		if(a1 > a2) System.out.println("a1 maior");
		else System.out.println("a2 maior");
		
		return 0.0;
	}

	public static void triangulo() {
		Triangulo t1 = new Triangulo(3.0, 4.0, 5.0);
		
		System.out.println(t1);
		
		// testando referencia ao mesmo obj
		Triangulo t2 = t1;
		
		t2.setX(10.0);

		System.out.println(t1);
	}
	
	public static void AulaArray() {
		
		List<Estudante> nomes = new ArrayList<>();
		
		nomes.add(new Estudante("Prado"));
		nomes.add(new Estudante("Pedro"));
		nomes.add(new Estudante("Naria"));
		nomes.add(new Estudante("Teresa"));
		nomes.add(new Estudante("Paulo"));
		
		
		for (Estudante nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------------------------");
		
		nomes.removeIf(x -> x.nome.charAt(0) == 'M');
		
		for (Estudante nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("----------------------------------------");
		
		List<Estudante> filtro = nomes.stream().filter(x -> x.nome.charAt(0) == 'P').collect(Collectors.toList());
		
		for (Estudante estudante : filtro) {
			System.out.println(estudante);
		}
		
		
		System.out.println("----------------------------------------");
		
		Estudante filtro2 = nomes.stream().filter(x -> x.nome.charAt(0) == 'P').findFirst().orElse(null);
		
		System.out.println(filtro2);
	}
	
	public static void aulaMatrizes() {
		int[][] mat = new int[5][4];
		
		System.out.println("linhas: " + mat.length + " | Colunas: " + mat[0].length);
	}
	
	public static void exercMatriz() {
		
	
	}
	
	public static void datas() throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		// Date seria o instante de tempo, usamos Calendar para manipular este tempo e
		// SimpleDateFormat para formatar
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		Date x5 = Date.from(Instant.parse("1996-05-26T15:50:10Z"));
		
		Date y1 = sdf1.parse("26/05/1996");
		Date y2 = sdf2.parse("26/05/2019 15:56:55");
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(y2 + "\n");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		System.out.println(sdf3.format(x5));
		
		System.out.println("\n" + sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		
	}
	
	
	public static void calendar() throws ParseException {
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y2 = sdf2.parse("26/05/2019 15:56:55");
		
		System.out.println(sdf2.format(y2));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y2);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH); //somamos pq ele conta os meses de 0 a 11
		
		y2 = cal.getTime();
		System.out.println(sdf2.format(y2));
		System.out.println(minutos);
		System.out.println(mes);
		
		
	}
}



















