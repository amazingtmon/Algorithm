
class Solution {

    public String longestCommonPrefix(String[] strs) {

        /*
            strs.length가 1일경우
            ex) String[] strs5 = {"a"};
         */
        if(strs.length == 1){
            return strs[0];
        }

        //기준을 세우기 위한 변수
        char[] chars = strs[0].toCharArray();
        //최종 결과값 return을 위한 변수
        String result = "";

        // 주어진 strs.length 만큼 for문 실행
        for(int i = 0; i < strs.length; i++){
            int lowest_length = chars.length;

            //strs[i] 값이 "" or 비교하려는 두 단어의 첫번째 알파벳이 다를경우 ""을 return 한다.
            if(strs[i].equals("") || chars[0] != strs[i].charAt(0)){
                return "";
            }

            //두 단어를 비교해서 가장 작은 length를 구함
            if(strs[i].toCharArray().length < lowest_length){
                lowest_length = strs[i].toCharArray().length;
            }

            //비교한 단어들의 동일한 알파벳을 담아두기 위한 변수
            String concat_str = "";

            for(int j = 0; j<lowest_length; j++){
                if(chars[j] != strs[i].charAt(j)){
                    break;
                }
                //동일한 알파벳일 경우 concat_str에 담아준다
                concat_str += strs[i].charAt(j);

                //strs의 마지막 단어, 마지막 알파벳과 비교가 완료됐을때
                if(i == strs.length - 1 && j == lowest_length - 1 ){
                    return concat_str;
                }
            }// end for

            //return을 위한 최종 결과값에 대입
            result = concat_str;
            //두 단어의 비교를 통해 동일한 알파벳으로 이루어진 concat_str을 chars 변수에 대입
            chars = concat_str.toCharArray();
        }// end for

        return result;
    }

}
