package com.bilgeadam.boost.week04.lecture002.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSomeFeatures {

	public static void main(String[] args) 
	{
		List <User> users = new ArrayList<>();
		
		users.add(new User(56,"Samet"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));
        
        
//        for (User user : users) {
//			System.out.println(user);
//		}
        users.stream().forEach(user -> System.out.println(user));
        
        //birden fazla işlem yapmak istersem
        users.stream().forEach(user -> {
        	System.out.println("Java 8");
        	System.out.println(user);
        });
        
        users.stream().forEach(user -> user.talk());
        
//        users.stream().forEach(User::talk());
        
        //User id'si 5ten büyük olan kaç kişi var?
        long count = users.stream().filter(user -> user.id>5).count();
        System.out.println(count);
        
        //Filtrelediğim elemanları listelemek istiyorum.
        List<User> filteredList = users.stream()
        .filter(user -> user.id>5)
        .collect(Collectors.toList());
        
//        System.out.println(filteredList);
        
        filteredList.stream().forEach(user -> user.talk());   
        
        //Map çalıştığın liste üzerinde değişiklik yapıp onları yeni birer elemana maplememizi sağlar.
       
        List<User> mappedList = users.stream()
        .map(user -> new User (user.getId()+100,user.getName()))
        .collect(Collectors.toList());
        
        mappedList.stream().forEach(user -> System.out.println(user));
        
        
	}

}
