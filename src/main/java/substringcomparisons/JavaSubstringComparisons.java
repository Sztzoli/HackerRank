package substringcomparisons;

public class JavaSubstringComparisons {
    public void program(String s, int k){
        String[] subStringThreeLength = new String[s.length()-(k-1)];
        for (int i = 0; i < subStringThreeLength.length; i++) {
            subStringThreeLength[i]=s.substring(i,i+k);
        }
        String largest="AAA";
        String smallest="zzz";
        for (String elem : subStringThreeLength ) {
            if(elem.compareTo(largest)>0){
                largest=elem;
            }
            if(elem.compareTo(smallest)<0){
                smallest=elem;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

    public static void main(String[] args) {
        new JavaSubstringComparisons().program("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",144);
    }
}
