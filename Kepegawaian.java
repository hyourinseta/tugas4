public class Kepegawaian {
	public static void main (String[] args) {
		Manager bos = new Manager("Hendriko", "Sumedang", 7500000);
		bos.setBonus(1000000);

		Employee[] pegawai = new Employee[3];
		pegawai[0] = bos;
		pegawai[1] = new Staff("Gugi Gustaman", "Cibeureum", 4000000);
		pegawai[2] = new Staff("Mira Margaretha", "Dayeuhkolot", 5000000);

		for (int i = 0; i < pegawai.length; i++) {
			System.out.println(pegawai[i].getName()+"\t"+pegawai[i].getAddress()+"\t"+pegawai[i].getSalary());
		}
	}
}