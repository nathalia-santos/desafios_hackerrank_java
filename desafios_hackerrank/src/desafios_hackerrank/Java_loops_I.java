package desafios_hackerrank;

public class Java_loops_I {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int multiplicador = 1;
        while(multiplicador <= 10) {
            int resultado = N * multiplicador;
            System.out.println(N +" x "+ multiplicador + " = " + resultado);
            multiplicador ++;
        }
        bufferedReader.close();
    }

}
