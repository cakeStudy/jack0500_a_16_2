import java.util.NoSuchElementException;

public class a_16_2
{
    /*Write a method called max that returns the maximum value in a list of integers. If the list is empty, it should throw a
    NoSuchElementException.*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);
        addNodeToList(4,2);
        addNodeToList(5,3);

        System.out.println(max());
    }


    public int max()
    {
        int max = 0;
        //if the list is empty
        if (front == null)
        {
            throw new NoSuchElementException();
        }
        //the for-loop count the maximum number there is in the list.
        for (ListNode current = front; current != null; current = current.next)
        {
            max++;
        }
        return max;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
