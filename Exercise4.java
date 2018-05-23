package Chapter16;

public class Exercise4
{
    /*
    Write a method called lastIndexOf that accepts an integer value as a parameter
     and that returns the index in the list of the last occurrence of that value, or
      􏰀1 if the value is not found in the list. For example, if a variable list stores
      the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18)
      should return 6. If the call had instead been list.lastIndexOf(3), the method would return –1.
     */

    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);
        addNodeToList(3,3);
        addNodeToList(3,3);
        addNodeToList(3,3);


        System.out.println(lastIndexOf(2));
    }

    private static Integer lastIndexOf(Integer value)
    {
        Integer index = -1;
        Integer counter = 1;

        for (ListNode current = front; current != null; current = current.next)
        {
            counter++;
            if(value == current.data)
            {
                index = -1;
                index += counter;
            }
        }

        return index;
    }

    private static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
