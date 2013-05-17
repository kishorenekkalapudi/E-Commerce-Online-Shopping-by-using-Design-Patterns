package org.onlineshopping.composite;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.onlineshopping.client.Buyer;
import org.onlineshopping.client.BuyerOptions;
import org.onlineshopping.client.Common;
import org.onlineshopping.observer.BidNotifications;
import org.onlineshopping.observer.Bids;

public class CloseBidding {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int BiddingAmount;
	Buyer buyer=new Buyer();
	BuyerOptions buyeroptions=new BuyerOptions();
	BidNotifications bidnotifications=new BidNotifications();
	Bids bids=new Bids();
		
	public void CloseBid(String ItemName, int ItemPrice){
		System.out.println("Time : 5:00");
		Common.DrawLine();
		System.out.print("Item Price :"+ItemPrice);
		//System.out.print("\t\t Current Bidding :"+bidnotifications.CurrentBidding());
		System.out.println("Press 0 To Go Back :");
		System.out.println();
		Common.DrawLine();
		System.out.println("Enter Bidding Amount :");
		try{
		BiddingAmount=Integer.parseInt(br.readLine());
		if(BiddingAmount==0){
			Common.BlankSpaces();
			buyeroptions.MainOptions();
		}
		else{
		String UserName=buyer.getBuyer_UserName();
		
		if(BiddingAmount>ItemPrice){
			BiddingArray.AllBids.add(UserName+" Bidded Amount $ "+BiddingAmount+" To "+ItemName);
			bids.setBids(buyer.getBuyer_UserName()+" CBidded "+" Amount $"+" "+BiddingAmount+" To "+ItemName);
			Common.DrawLine();
			System.out.println("Bid Placed Successfully");
			System.out.println("Press Enter to Go Back");
			br.readLine();
			Common.BlankSpaces();
			buyeroptions.MainOptions();
		}
		else{
			System.out.println("Enter Bidding Amount Grater Than The Original Amount");
			Common.Wait(1000);
			this.CloseBid(ItemName,ItemPrice);
		}
		}		
		}
		catch(Exception er){
			Common.InvalidSelection();
			this.CloseBid(ItemName,ItemPrice);
		}
	}
}
