package varargsaddition;

public class Add {

    public void add(int ... numbers) {
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length-1; i++) {
            sb.append(numbers[i]).append("+");
        }
        sb.append(numbers[numbers.length-1]).append("=").append(sum);
        System.out.println(sb.toString());

    }
}
