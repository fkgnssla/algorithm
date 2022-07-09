public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt(); sc.nextLine();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++) {
            if(arr[i]<=len) len++;
            else break;
        }
        System.out.println(len);
    }
}
