class MedianFinder {

    PriorityQueue<Integer>leftMaxHeap;
    PriorityQueue<Integer>rightMinHeap;

    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<Integer>((a,b) -> b-a);
        rightMinHeap = new PriorityQueue<Integer>((a,b) -> a-b);
    }
    
    public void addNum(int num) {
        leftMaxHeap.add(num);

        if(leftMaxHeap.size() - rightMinHeap.size() > 1 || 
        !rightMinHeap.isEmpty() && leftMaxHeap.peek() > rightMinHeap.peek()){
            rightMinHeap.add(leftMaxHeap.poll());
        }

        if(rightMinHeap.size() - leftMaxHeap.size() > 1){
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.size() == rightMinHeap.size()){
            return (double)(rightMinHeap.peek() + leftMaxHeap.peek())/2;
        }
        else if(leftMaxHeap.size() > rightMinHeap.size()){
            return (double)leftMaxHeap.peek();
        }
        else{
            return (double)rightMinHeap.peek();
        }
    }
}
