package com.bilgeadam.boost.week02.lecture004;

import java.util.Scanner;

import com.bilgeadam.boost.week02.lecture004.model.Item;

public class TheBakkal 
{	
	private static final int MAX_ITEMS = 5; //	bir sabit tanimladik, listemizin buyuklugunu belirlemek icin.
	private Scanner input;
	private Item[] 	items;
	private int		itemCount;
	public static void main(String[] args) 
	{
		TheBakkal bakkal = new TheBakkal();
		bakkal.itemCount =0;
		bakkal.items = new Item[MAX_ITEMS]; // bir array yaratilma yolu. MAX_ITEMS kadar ogesi olan bir array yarattik
		bakkal.menu();
		System.out.println("Bakkalimizi ziyaret ettiginiz icin tesekkurler.");

	}

	private void menu() 
	{
		this.input = new Scanner(System.in);
		while (true)
		{
		System.out.println("================ ");
		System.out.println(" Kardesler Gida ");
		System.out.println("================ ");
		System.out.println("1 - Yeni urun girisi ");
		System.out.println("2 - Urunleri listele ");
		System.out.println("3 - Alisveris yap ");
		System.out.println("4 - Eve don \n");
		System.out.print("Lutfen seciminizi yapiniz: ");
		int selection =this.input.nextInt();
		input.nextLine(); 		// her sayi bilgisi okunduktan sonra bir sonraki giriste hata yasamamak icin nextLine() metodunu cagir
		if(selection == 4) 
			{
			break;
			}
		if(!this.processSelection(selection)) 
		{
			System.err.println("Yanlis secim yaptiniz. Lutfen tekrarlayın!");
			continue;
		}
		}
		this.input.close();
	}
	
	private boolean processSelection(int selection) 
	{
		boolean returnValue = true;
		
		switch (selection) 
		{
		case 1: 
			this.createGood();
			System.out.println("Yeni urun girisi");
			break;
		case 2: 
			this.listGoods();
			System.out.println("Urunleri listele");
			break;
		case 3: 
			this.shopping();
			System.out.println("Alisveris yap");
			break;
		default:
			returnValue = false;
			
		}
		return returnValue;
		}

	private void shopping() 
	{
			boolean continueShopping = true;
			
			if(itemCount == 0 )  // bunun yerine if (items[0] == null)
			{
				System.out.println("Bakkal kapali");
				return;
			}
			
			System.out.println("Alis Veris");
			System.out.println("============\n");
			double totalPrice = 0.0;
			do 
			{
				System.out.println("Almak istediginiz urunu belirtiniz (bitirmek icin TAMAM): ");
				String itemName = input.nextLine();
				if(itemName.equalsIgnoreCase("TAMAM"))
				{
					System.out.println("Gule gule");
					continueShopping = false;	//do-while'i gostermek icin boyle yazdik. Aslinda break ile daha temiz olurdu.
				}
				else
				{	Item item = itemExists(itemName);
					if(item == null) 
					{
						System.out.println("Istediginiz urun depoda bulunmamakta. Baska nasil yardimci olabilirim?");
						continue;
					}
					System.out.println("Kaç "+ item.getUnit() + " " +item.getName()+ " almak istiyorsunuz?");
					double amount = input.nextDouble();
					input.nextLine();
					if(amount>item.getAmount()) 
					{
						System.out.println("Istediginiz miktarda " + item.getName() + " yok. En fazla "+ item.getAmount()+ " " +item.getUnit()+ " alabilirsiniz");
					}
					else
					{
						double price = amount * item.getUnitPrice() * (1+item.getVatRate()/100);
						System.out.println(amount + " "+ item.getUnit()+ " icin toplam KDV dahil fiyat: "+ price);
						totalPrice += price;
						item.setAmount(item.getAmount()-(int) amount);
					}
				}	
			} while (continueShopping);
			
			if(totalPrice == 0.0) 
			{
				System.out.println("Alis veris yapmadan ayriliyorsunuz");
			}
			else
			{
				System.out.println("Lutfen kasada " + totalPrice + " TL ödeyiniz.");
			}
	}

	private Item itemExists(String itemName) 
	{
		Item retVal = null;
		for(int i = 0; i<items.length; i++) 
		{
			if(items[i] == null)
			{
				break;
			}
			if(items[i].getName().equalsIgnoreCase(itemName) && items[i].getAmount() >0.0)
			{
				retVal = items[i];
				break;
			}
		}
		return retVal;
	}

	private void listGoods() 
	{
		if(itemCount == 0 ) 
		{
			System.out.println("Depoda ürün yok");
			return;
		}
		System.out.println("Urun Listesi");
		System.out.println("============\n");
		for (int i=0 ; i < items.length ; i++)  // yerine yazilabilirdi: for (int i=0; i < MAX_ITEMS; i++)
		{
			if (items[i] == null) 
			{
				break;
			}
			System.out.println((i+1)  + ". Urun: " +items[i]);
		}
	}

	private void createGood() 
	{
		if(itemCount >= MAX_ITEMS)
		{
			System.err.println("Depoda yer kalmadi");
			return;
		}
		System.out.println("\nYeni Urun girisi");
		System.out.println("=================\n");
		System.out.print("Urun ismini giriniz;			");
		String itemName = input.nextLine();
		System.out.print("Urun birimini giriniz:		");
		String unit = input.nextLine();
		System.out.print("Urun birim fiyatını giriniz:	");
		double unitPrice = input.nextDouble();
		System.out.print("Urun KDV oranini giriniz:	");
		int vat = input.nextInt();
		input.nextLine();
		
		System.out.println("Urun miktarini giriniz: ");
		int amount = input.nextInt();
		
		Item item = new Item();
		item.setName(itemName);
		item.setUnit(unit);
		item.setUnitPrice(unitPrice);
		item.setVatRate(vat);
		item.setAmount(amount);
		items[itemCount++] =item;
		/* yukarıdaki ifade yerine bunlar da kullanılabilir
		items[itemCount] = item;
		itemCount += 1;
		itemCount = itemCount +1
		*/
		System.out.println(item);
	
		
			
	}
		
		
		
}

