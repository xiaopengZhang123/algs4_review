public int[]arr;
    public int find(int index){
        if(index!=arr[index]){
            arr[index]=find(arr[index]);
        }
        return index;
    }