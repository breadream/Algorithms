class bubble_Sort {
// O(n^2)
        
        public static void bubbleSort(int[] list) { 
                boolean needNextPass = false;
                for (int k = 1; k < list.length && needNextPass; k++) { // Array may be sorted and next pass not needed needNextPass = false;
                         for (int i = 0; i < list.length - k; i++) {
                                 if (list[i] > list[i + 1]) {
                                        // Swap list[i] with list[i + 1] 
                                        int temp = list[i];
                                        list[i] = list[i + 1];
                                        list[i + 1] = temp;
                                        needNextPass = true;
                                        }
                                }
                        }
        }
        public static void main(String[] args) {        
                int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
                for (int nextItem : list) 
                        System.out.print(nextItem + " ");
                System.out.print("\n");
                bubbleSort(list);
                for (int nextItem : list)
                        System.out.print(nextItem + " ");
                }
        
        }


