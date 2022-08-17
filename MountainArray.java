class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < arr.length) {
            if(left + 1 < arr.length && arr[left + 1] > arr[left]) {
                left++;
            }
            else {
                break;
            }
        }
        while(right >= 0) {
            if(right - 1 >= 0 && arr[right - 1] > arr[right]) {
                right--;
            }
            else {
                break;
            }
        }
        if(left == arr.length - 1 || right == 0) {
            return false;
        }
        return left == right;
    }
	public static void main(String [] args){
		int a[]={5,6,3,2,1};
		MountainArray ma=new MountainArray();
		System.out.println("Mountain Array Status: "+ma.validMountainArray(a));
	}
}