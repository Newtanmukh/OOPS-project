public class DeskPhone implements Telephone{

private String myNumber;
private boolean isRinging;

public DeskPhone(String myNumber){
  this.myNumber=myNumber;
}

public void powerOn(){
  System.out.println("DeskPhone is always powered on.");
}

public void dial(String phoneNumber){
  System.out.println("Now ringing "+phoneNumber + " on deskphone.");
}

public void answer(){//we can answer only if the deskphone is ringing.
if(isRinging)
{System.out.println("Answering the desk phone.");
isRinging=false;}
else
{System.out.println("Phone is not ringing");}
  
}

public boolean callPhone(String phoneNumber){
  if(phoneNumber==myNumber){//i.e, whether our phone is ringing or not.
    isRinging=true;
    System.out.println("Phone Ringing");
  }else
  {
    isRinging=false;
  }
  return isRinging;
}

public boolean isRinging(){
  return false;
}


}