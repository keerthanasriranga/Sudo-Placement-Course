class GfG
{
 int detectLoop(Node head)
  {
   // Add code here
   if(head==null)return 0;
   Node slowp = head;
   Node fastp = head;
   while(fastp!=null&&fastp.next!=null){
       slowp = slowp.next;
       fastp = fastp.next.next;
       if(slowp == fastp)return 1;
   }
   return 0;
    }
}

https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1/?track=SP-Misc
