import java.util.*;

class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }

        int k=0;

        for(Integer key : hm.keySet()){
            int count = hm.get(key);

            while(count-- > 0){
                nums[k++] = key;
            }
        }

        return k;
    }

    public static void main(String[] args){
        RemoveElement obj = new RemoveElement();

        int[] nums = {3,2,2,3};
        int val = 3;

        int result = obj.removeElement(nums,val);

        System.out.println(result);
    }
}