package com.course1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.practice1.Address;
import com.practice1.Customer;

public class JDK8StreamAPIPOJo {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setId(1099);
		c1.setFirstName("sai");
		c1.setLasttName("kotlin");

		Address a1 = new Address();
		a1.setId("ha1");
		a1.setHouseNumber("100");
		a1.setState("NY");
		a1.setStreetName("somecircle");
		a1.setZipcode(34455l);

		Address a2 = new Address();
		a2.setId("ha2");
		a2.setHouseNumber("1020");
		a2.setState("NY");
		a2.setStreetName("somecircle2");
		a2.setZipcode(34456l);

		List<Address> addressList = new ArrayList<>();

		addressList.add(a1);
		addressList.add(a2);
		c1.setAddressList(addressList);

		Customer c2 = new Customer();
		c2.setId(1044);
		c2.setFirstName("sai2");
		c2.setLasttName("kotlin2");

		Address ac2 = new Address();
		ac2.setId("ha1");
		ac2.setHouseNumber("100");
		ac2.setState("NY");
		ac2.setStreetName("somecircle");
		ac2.setZipcode(34455l);

		Address a2c2 = new Address();
		a2c2.setId("ha2");
		a2c2.setHouseNumber("1020");
		a2c2.setState("NY");
		a2c2.setStreetName("somecircle2");
		a2c2.setZipcode(34456l);

		List<Address> addressList2 = new ArrayList<>();

		addressList2.add(a1);
		addressList2.add(a2);
		c2.setAddressList(addressList2);

		List<Customer> customerList = new ArrayList<>();
		customerList.add(c1);

		customerList.add(c2);
		customerList.forEach(cust -> {
			cust.getAddressList().forEach(address -> System.out.println(address.getHouseNumber()));
		});

		// Group by / sort
		// condition

		Predicate<Address> hno1020 = add -> (add.getHouseNumber() == "1020");

		customerList.forEach(cust -> {

			Optional<Address> hno1020add = cust.getAddressList().stream().filter(hno1020).findAny();

			List<Address> hno1020All = cust.getAddressList().stream().filter(hno1020).collect(Collectors.toList());

			System.out.println(hno1020add.get().getHouseNumber());

		});

	}

}
