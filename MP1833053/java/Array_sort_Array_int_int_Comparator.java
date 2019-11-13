import java.util.Arrays;
import java.util.Comparator;

/**����_������(_�β�����)*
 * @author: ��׳׳_MP1833053
 *  @className: Array_sort_int_int_Comparator
 *  @apiSignature:  java.lang.Arrays$public static void sort (T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
 *  @description: Test java api java.lang.Arrays$public static void sort (T[] a, int fromIndex, int toIndex, Comparator<? super T> c)
 *  @Map: 
 *  @Map: 
 *  @Map: 
 *  @Map: 
 */
public class Array_sort_Array_int_int_Comparator {
	  /**
     * input: 4
     * a a={0,6,5,4,3,0,0}
     * fromIndex fromIndex=1
     * toIndex toIndex=5
     * comparator comparator = new TestComparator();
     * output: 1
     * ret0 ret0={0,3,4,5,6,0,0}
     */
    public static void sort0(){
        System.out.println(">>>>>>>>>>>>");
        Integer[] a = {0,6,5,4,3,0,0};
        assert (Arrays.equals(a,new Integer[] {0,6,5,4,3,0,0}));
        Comparator comparator = new TestComparator();
        Arrays.sort(a, 1 , 5,comparator);
        Integer[] ret0 = a;
        assert (Arrays.equals(ret0,new Integer[] {0,3,4,5,6,0,0}));
        for(int i=0;i<ret0.length;i++) {
			System.out.print(ret0[i]+" ");
		}
    }


    public static void main(String[] args) {
    	Array_sort_Array_int_int_Comparator.sort0();
    }
}

class TestComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return -1;
		}
		else if(o1>o2) {
			return 1;
			
		}else {
			return 0;
		}
	}
	
}
