package Problem6;

public class Pythagoreantriplet {
	public static void main(String[] args) {
		int ans = 0;
		boolean flag = false;
		for(int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if((i)+(j) > 1000) {
					break;
				}
				if(flag) {
					break;
				}
				for (int k = 1; k < 1000; k++) {
					if((i)+(j)+(k) > 1000) {
						break;
					}
					else if ((i)+(j)+(k) == 1000) {
						if((i*i)+(j*j) == (k*k)) {
							ans = i*j*k;
							flag = true;
						}
					}

				}
			}
			if(flag) {
				break;
			}
		}
		System.out.println(ans);
	}
}
