class ResizeArray{
    public int[]arr;
    public int max=8;
    int size;
    public void push(int item){
        if(size==arr.length){
            resize(arr.length*2);
        }
        arr[size++]=item;
    }
    public void resize(int length){
        int[]copy=new int[length];
        for (int i = 0; i < arr.length; i++) {
            copy[i]=arr[i];
        }
        //赋值
        arr=copy;
    }
    public int pop(){
        if(size&&size==arr.length/4){
            resize(arr.length/2);
        }
        return arr[sz--];
    }
}