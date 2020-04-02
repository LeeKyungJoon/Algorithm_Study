package Study;

class PhysicalExamination {

    static final int VMAX = 21;

    // 시력 분포를 사람 수만큼 기호 문자 *로 반복하여 나타내세요.
    static class PhyscData {
        double vision;

        PhyscData(double vision) {
            this.vision = vision;
        }
    }

    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for(i = 0; i < dat.length; i++) { // 주어진 시력들의 전체 수만큼 for문을 돌림
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) { // 0.0 ~ 2.1까지 시력이 존재
                dist[(int) (dat[i].vision * 10)]++;                      // 각각의 시력에 * 10을 한 값을 키값으로 지정
            }
        }
    }

    public static void main(String[] args) {

        PhyscData[] x = {           // 각각의 시력
            new PhyscData(0.3),
            new PhyscData(0.3),
            new PhyscData(2.0),
            new PhyscData(1.5),
            new PhyscData(2.0),
            new PhyscData(0.3),
            new PhyscData(0.9),
            new PhyscData(1.5),
            new PhyscData(1.2),
            new PhyscData(0.1),
        };
        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("시력");
        for(int i = 0; i < x.length; i++) {
            System.out.printf("%3.1f\n", x[i].vision); // 각각의 시력 출력
        }

        distVision(x, vdist);

        System.out.println("\n시력분포");
        for(int i  = 0; i < VMAX; i++) {
            System.out.printf("%3.1f ~ : ", i / 10.0);
            
            for(int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    

    

}