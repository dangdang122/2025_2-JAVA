package mvc_jdbc_test.view;

import mvc_jdbc_test.entity.Customer;

import java.util.Scanner;

public class InputCustomerInfoView {
    public Customer inputCustomerInfo(){
        Customer customer = new Customer();
        Scanner s = new Scanner(System.in);
        System.out.println("----고객 정보 입력----");
        System.out.println("고객아이디 입력:");
        String customerId = s.nextLine();
        System.out.println("고객이름 입력:");
        String customerName = s.nextLine();
        System.out.println("고객나이 입력:");
        int customerAge = s.nextInt();
        s.nextLine();
        System.out.println("고객등급 입력:");
        String customerLevel = s.nextLine();
        System.out.println("고객직업 입력:");
        String customerJob = s.nextLine();
        System.out.println("고객적립금 입력:");
        int customerReward = s.nextInt();
        customer.setCustomerid(customerId);
        customer.setCustomername(customerName);
        customer.setAge(customerAge);
        customer.setLevel(customerLevel);
        customer.setJob(customerJob);
        customer.setReward(customerReward);

        s.close();
        return customer;
    }
}
