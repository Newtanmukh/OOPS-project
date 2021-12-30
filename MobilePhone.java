public class MobilePhone implements Telephone{

private String myNumber;
private boolean isRinging;
private boolean isPowerOn;

public MobilePhone(String myNumber){
  this.myNumber=myNumber;
}

public void powerOn(){
  isPowerOn=true;
  System.out.println("Phone powered on.");
}

public void dial(String phoneNumber){
  System.out.println("Now ringing "+phoneNumber + " on deskphone.");
}

public void answer(){//we can answer only if the deskphone is ringing.
if(isRinging && isPowerOn)
{System.out.println("Answering the  phone.");
isRinging=false;}
else
{System.out.println("Phone is not ringing");}
  
}

public boolean callPhone(String phoneNumber){
  if(phoneNumber==myNumber && isPowerOn){//i.e, whether our phone is ringing or not.
    isRinging=true;
    System.out.println("Phone Ringing");
  }else
  {System.out.println("EIther wrong number entered or phone is off.");
    isRinging=false;
  }
  return isRinging;
}

public boolean isRinging(){
  return false;
}


}