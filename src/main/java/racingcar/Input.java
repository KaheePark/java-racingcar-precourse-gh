package racingcar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readCarNames(){
        // TODO: void 고려
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String[] carName = null;

        try {
            String carNames = br.readLine();

            // 입력받은 자동차 이름 콤마로 구분해서 배열에 넣기
            carName = carNames.split(",");
            // TODO: 이름이 5글자 이상인지 확인해야한다.

        } catch(IOException e){
            System.out.println("[ERROR] 이름은 5글자 이상일 수 없습니다.");
        }

        return carName;
    }


    public int readNumber() throws IOException{
        // TODO: void 고려
        int number = 0;
        try {
            System.out.println("시도할 횟수는 몇회인가요?");
            number = Integer.parseInt(br.readLine());

        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");

            // TODO: 시도할 횟수는 몇회인가요?로 돌아가야한다.
        }
        return number;
    }
}
