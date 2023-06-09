package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {	// 4번 작업 : 해당 명과 같은 패키지 및 클래스 만들기
	//Chicken
	//Eagle
	//Penguin
	//Shark
	//Whale
	
	//TypeBirds
	//TypeMammalia (포유류)
	//TypePisces (어류)
	
	
	

	
	public void ex1() {  //5번 작업
		                 // 10번 : 동물 하나씩 객체화 시키기
		//포유류
		Dog dog = new Dog();
		Cat cat = new Cat();
		Whale whale = new Whale();
		
		//조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		//어류
		Shark shark = new Shark();
		
		
		/*
		dog.cry();
		dog.eat();
		dog.move();
		
		cat.cry();
		cat.eat();
		cat.move();
		*/
		
		// Animal animal = new Animal();
		// 오류나는 이유 : 추상클래스는 객체로 만들 수 없지만, 타입으로서의 역할은 한다.
		
		
		TypeMammalia[] mammalia = new TypeMammalia[] {cat, dog, whale};
		TypeBirds[] birds = new TypeBirds[] {chicken, eagle, penguin};
		TypePisces[] pisces = new TypePisces[] {shark};
		
		Animal[] animal = new Animal[] {
				cat, dog, whale,
				chicken, eagle, penguin,
				shark,
				//mammalia[0],
				//birds[2],
		};
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			// 만약 animal중에 타입이 고양이 일 때
			// 수유를 한다 == breastfeed() 출력;
			if(animal[i] instanceof Cat) {
				System.out.println("===========고양이는요!===========");
				((Cat)animal[i]).breastfeed(); //다운캐스팅. 강제형변환
				// 고양이가 소속되어있는 포유류만 가지고 있던 수유를 하다. 메서드
				// Cat 클래스에서 오버라이딩으로 재정의된 내용이 출력된다.
				System.out.println("===========이렇습니다.===========");
			}
			
			if(animal[i] instanceof Eagle) {
				System.out.println("===========독수리는요!===========");
				Eagle eg = (Eagle) animal[i];
				eg.fly(); //TypeBirds에서 일반메서드로 정의한 내용
				System.out.println("===========이렇습니다.===========");
			}
			
			if(animal[i] instanceof Shark) {
				System.out.println("===========상어는요!===========");
				Shark sk = (Shark) animal[i];
				sk.swimming();
				System.out.println("===========이렇습니다.===========");
			}
			
				
		
		}
		
	}
		
		
}





